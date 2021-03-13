package com.zby.server01.service;

import com.zby.server01.pojo.Group;
import org.springframework.stereotype.Service;

@Service
public interface GroupService {
    int createGroup(String name,long projectId,long uid);
    int deleteGroup(long groupId,long uid);
    int modifyGroup(long groupId,long uid,String re_name);
    Group findGroup(long groupId);
    Group findGroupByProjectId(long projectId);
}
