package com.redspark.beingcricket.beingcricketserver.data;

import com.redspark.beingcricket.beingcricketserver.domain.Coach;
import org.springframework.data.repository.CrudRepository;

public interface CoachRepository extends CrudRepository<Coach, String> {
}
