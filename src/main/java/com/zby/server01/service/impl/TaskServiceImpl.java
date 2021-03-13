package com.zby.server01.service.impl;

import com.zby.server01.dao.GroupTaskMapper;
import com.zby.server01.dao.TaskMapper;
import com.zby.server01.pojo.GroupTask;
import com.zby.server01.pojo.GroupTaskExample;
import com.zby.server01.pojo.Task;
import com.zby.server01.pojo.TaskExample;
import com.zby.server01.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.task.TaskExecutor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {
    @Autowired
    private TaskMapper taskMapper;
    @Autowired
    private GroupTaskMapper groupTaskMapper;

    @Override
    public int createTask(Task task) {
        return taskMapper.insertSelective(task);
    }

    @Override
    public int modifyTask(long taskId, long uid, String content, String info, int state, Date ddl, int priority) {
        TaskExample taskExample = new TaskExample();
        TaskExample.Criteria criteria = taskExample.createCriteria();
        criteria.andTask_idEqualTo(taskId);

        Task task = new Task();
        task.setContent(content);
        task.setUid(uid);
        task.setContent(content);
        task.setInfo(info);
        task.setState(state);
        task.setDdl(ddl);
        task.setPriority(priority);

        return taskMapper.updateByExampleSelective(task,taskExample);
    }

    @Override
    public int deleteTask(long taskId, long uid) {
        TaskExample taskExample = new TaskExample();
        TaskExample.Criteria criteria = taskExample.createCriteria();
        criteria.andTask_idEqualTo(taskId);
        criteria.andUidEqualTo(uid);
        return taskMapper.deleteByExample(taskExample);
    }

    @Override
    public Task findTask(long taskId) {
        TaskExample taskExample = new TaskExample();
        TaskExample.Criteria criteria = taskExample.createCriteria();
        criteria.andTask_idEqualTo(taskId);
        List<Task> list = taskMapper.selectByExample(taskExample);
        if (list.isEmpty()){
            return null;
        }else
            return list.get(0);
    }

    @Override
    public List<Task> getAllTasksByUid(long uid) {
        TaskExample taskExample = new TaskExample();
        TaskExample.Criteria criteria = taskExample.createCriteria();
        criteria.andUidEqualTo(uid);
        return taskMapper.selectByExample(taskExample);
    }

    @Override
    public List<Task> getAllTasksByGroup(long groupId) {
        GroupTaskExample groupTaskExample = new GroupTaskExample();
        GroupTaskExample.Criteria criteria = groupTaskExample.createCriteria();
        criteria.andGroup_idEqualTo(groupId);
        List<GroupTask> list = groupTaskMapper.selectByExample(groupTaskExample);
        List<Task> taskList = new ArrayList<>();
        for (GroupTask item:list) {
            Task task = taskMapper.selectByPrimaryKey(item.getTask_id());
            taskList.add(task);
        }
        return taskList;
    }
}
