package com.hw.sentiment.dto.topiccommunicatepath;

import com.hw.sentiment.dto.MessageHead;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * @author ymy
 * @date 2020/1/2
 * @description xml信息包含的内容
 */
@XmlRootElement(name="Message")
public class Message {
    private List<MessageHead> messageHeads;
    private List<MessageContent> messageContents;

    public List<MessageHead> getMessageHeads() {
        return messageHeads;
    }
    @XmlElement(name="MessageHead")
    public void setMessageHeads(List<MessageHead> messageHeads) {
        this.messageHeads = messageHeads;
    }

    public List<MessageContent> getMessageContents() {
        return messageContents;
    }
    @XmlElement(name="MessageContent")
    public void setMessageContents(List<MessageContent> messageContents) {
        this.messageContents = messageContents;
    }
}
