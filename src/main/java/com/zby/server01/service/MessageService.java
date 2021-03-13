package com.zby.server01.service;

import com.zby.server01.pojo.Message;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MessageService {
    int createMessage(Message message);
    int deleteMessage(long messageId,long uid);
    Message findMessage(long messageId);
    List<Message> getAllMessages(long uid, long toUid);
}
