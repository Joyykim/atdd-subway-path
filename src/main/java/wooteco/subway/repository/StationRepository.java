package wooteco.subway.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import wooteco.subway.domain.Station;

public interface StationRepository extends CrudRepository<Station, Long> {
	@Override
	List<Station> findAllById(Iterable<Long> ids);

	@Override
	List<Station> findAll();
}