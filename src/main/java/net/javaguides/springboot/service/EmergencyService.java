package net.javaguides.springboot.service;

import net.javaguides.springboot.model.Emergency;
import net.javaguides.springboot.web.dto.EmergencyDto;

public interface EmergencyService {

	Emergency save(EmergencyDto emergencyDto);

	Emergency getEmergencyById(Long id);

	Iterable<Emergency> getAllEmergencies();

}
