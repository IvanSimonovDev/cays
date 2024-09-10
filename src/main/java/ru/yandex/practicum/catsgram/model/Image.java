package ru.yandex.practicum.catsgram.model;

import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode(of = {"id"})
@AllArgsConstructor
public class Image {
    Long id;
    long postId;
    String originalFileName;
    String filePath;
}