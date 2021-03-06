package com.jhipster.blog.repository.search;

import com.jhipster.blog.domain.Persona;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the Persona entity.
 */
public interface PersonaSearchRepository extends ElasticsearchRepository<Persona, Long> {
}
