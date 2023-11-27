package com.lostandfound.domain.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class Image {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "image_id")
    private Long id;

    private String url;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "post_id")
    private Post postImage;
}
