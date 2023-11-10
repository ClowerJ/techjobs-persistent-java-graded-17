package org.launchcode.techjobs.persistent.models.data;

import org.launchcode.techjobs.persistent.models.*;
import org.springframework.data.repository.*;
import org.springframework.stereotype.*;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillRepository extends CrudRepository<Skill, Integer> {
}
