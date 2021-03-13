package com.zby.server01.service.impl;

import com.zby.server01.dao.MessageMapper;
import com.zby.server01.pojo.Message;
import com.zby.server01.pojo.MessageExample;
import com.zby.server01.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;

import java.security.MessageDigest;
import java.util.List;

public class MessageServiceImpl implements MessageService {
    @Autowired
    private MessageMapper messageMapper;

    @Override
    public int createMessage(Message message) {
        return messageMapper.insertSelective(message);
    }

    @Override
    public int deleteMessage(long messageId, long uid) {
        Message message = messageMapper.selectByPrimaryKey(messageId);
        if (message.getUid()!=uid)
            return 0;
        return messageMapper.deleteByPrimaryKey(messageId);
    }

    @Override
    public Message findMessage(long messageId) {
        return messageMapper.selectByPrimaryKey(messageId);
    }

    @Override
    public List<Message> getAllMessages(long uid, long toUid) {
        MessageExample messageExample = new MessageExample();
        MessageExample.Criteria criteria = messageExample.createCriteria();
        criteria.andUidEqualTo(uid);
        criteria.andTo_uidEqualTo(toUid);

        List<Message> list  = messageMapper.selectByExample(messageExample);
        if (list.isEmpty())
            return null;
        return list;
    }
}
