package com.zby.server01.service.impl;

import com.zby.server01.dao.GroupMapper;
import com.zby.server01.pojo.Group;
import com.zby.server01.pojo.GroupExample;
import com.zby.server01.service.GroupService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupServiceImpl implements GroupService {
    @Autowired
    private GroupMapper groupMapper;


    @Override
    public int createGroup(String name, long projectId,long uid) {
        Group group = new Group();
        group.setName(name);
        group.setProject_id(projectId);

        return groupMapper.insertSelective(group);
    }

    @Override
    public int deleteGroup(long groupId, long uid) {
        Group group = groupMapper.selectByPrimaryKey(groupId);
        if (group.getCreator()!=uid)
            return 0;
        return groupMapper.deleteByPrimaryKey(groupId);
    }

    @Override
    public int modifyGroup(long groupId, long uid, String re_name) {
        Group group = groupMapper.selectByPrimaryKey(groupId);
        if (group.getCreator()!=uid)
            return 0;
        Group re_group = new Group();
        re_group.setName(re_name);
        GroupExample groupExample = new GroupExample();
        GroupExample.Criteria criteria = groupExample.createCriteria();
        criteria.andGroup_idEqualTo(groupId);

        return groupMapper.updateByExampleSelective(re_group,groupExample);
    }

    @Override
    public Group findGroup(long groupId) {
        return groupMapper.selectByPrimaryKey(groupId);
    }

    @Override
    public Group findGroupByProjectId(long projectId) {
        GroupExample groupExample = new GroupExample();
        GroupExample.Criteria criteria = groupExample.createCriteria();
        criteria.andProject_idEqualTo(projectId);

        List<Group> groups = groupMapper.selectByExample(groupExample);
        if (groups.isEmpty())
            return null;
        return groups.get(0);
    }


}
