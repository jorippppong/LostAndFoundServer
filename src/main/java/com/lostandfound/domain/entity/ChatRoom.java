package com.lostandfound.domain.entity;

import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalDateTime;

@Entity
@Getter
public class ChatRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "chatroom_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "member_id1")
    private Member sender;

    @ManyToOne
    @JoinColumn(name = "member_id2")
    private Member receiver;

    private String name;
    private String status;
    private LocalDateTime created_at;
}
