package net.causw.application.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import net.causw.domain.model.PostDomainModel;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
public class PostAllResponseDto {
    private String id;
    private String title;
    private String writerName;
    private Integer writerAdmissionYear;
    private Long numComment;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    private PostAllResponseDto(
            String id,
            String title,
            String writerName,
            Integer writerAdmissionYear,
            Long numComment,
            LocalDateTime createdAt,
            LocalDateTime updatedAt
    ) {
        this.id = id;
        this.title = title;
        this.writerName = writerName;
        this.writerAdmissionYear = writerAdmissionYear;
        this.numComment = numComment;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public static PostAllResponseDto from(
            PostDomainModel post,
            Long numComment
    ) {
        return new PostAllResponseDto(
                post.getId(),
                post.getTitle(),
                post.getWriter().getName(),
                post.getWriter().getAdmissionYear(),
                numComment,
                post.getCreatedAt(),
                post.getUpdatedAt()
        );
    }
}