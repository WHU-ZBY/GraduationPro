package com.zby.server01.service;

import com.zby.server01.dao.ProjectMapper;
import com.zby.server01.pojo.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProjectService {
    int createProject(Project project);
    int deleteProject(long uid,long projectId);
    int modifyProject(long projectId,long uid,String name,String info,long teamId);
    Project findProjectById(long projectId);
    List<Project> getProjectsByUid(long uid);

}
