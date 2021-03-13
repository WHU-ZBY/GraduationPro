package com.zby.server01.service;


import com.zby.server01.pojo.Task;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public interface TaskService {
    int createTask(Task task);
    int modifyTask(long taskId,long uid, String content, String info, int state, Date ddl,int priority);
    int deleteTask(long taskId,long uid);
    Task findTask(long taskId);
    List<Task> getAllTasksByUid(long uid);
    List<Task> getAllTasksByGroup (long groupId);
}
