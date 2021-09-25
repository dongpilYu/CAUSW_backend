package net.causw.application.spi;

import net.causw.domain.model.PostDomainModel;

import java.util.Optional;

public interface PostPort {
    Optional<PostDomainModel> findById(String id);

    PostDomainModel create(PostDomainModel postDomainModel);
}
