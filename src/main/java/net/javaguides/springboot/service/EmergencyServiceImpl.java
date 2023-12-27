package net.javaguides.springboot.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.javaguides.springboot.model.Emergency;
import net.javaguides.springboot.model.Role;
import net.javaguides.springboot.model.User;
import net.javaguides.springboot.repository.EmergencyRepository;
import net.javaguides.springboot.web.dto.EmergencyDto;
import net.javaguides.springboot.web.dto.UserRegistrationDto;

@Service
public class EmergencyServiceImpl implements EmergencyService {

    private EmergencyRepository emergencyRepository;

    @Autowired
    public EmergencyServiceImpl(EmergencyRepository emergencyRepository) {
    	super();
        this.emergencyRepository = emergencyRepository;
    }
	@Override
    public Emergency save(EmergencyDto emergencyDto) {
        Emergency emergency = new Emergency(null, null, null, null);
        emergency.setDescription(emergencyDto.getDescription());
        emergency.setType(emergencyDto.getType());
        emergency.setLocation(emergencyDto.getLocation());

        return emergencyRepository.save(emergency);

    }
//    @Override
//    public EmergencyDto save(EmergencyDto emergencyDto) {
//        Emergency emergency = new Emergency();
//        emergency.setDescription(emergencyDto.getDescription());
//        emergency.setType(emergencyDto.getType());
//        emergency.setLocation(emergencyDto.getLocation());
//
//        Emergency savedEmergency = emergencyRepository.save(emergency);
//
//        // Assuming you have a constructor or a method in EmergencyDto to convert from Emergency
//        return new EmergencyDto(savedEmergency);
//    }
//    @Override
//
//    public Emergency save(EmergencyDto emergencyDto) {
//    	Emergency emergency = new Emergency 
//    			(emergencyDto.getDescription(), 
//    					emergencyDto.getType(), emergencyDto.getLocation(), null);
//		
//		return emergencyRepository.save(emergency);
//	}
	@Override
    public Emergency getEmergencyById(Long id) {
        return emergencyRepository.findById(id).orElse(null);
    }

	@Override
    public Iterable<Emergency> getAllEmergencies() {
        return emergencyRepository.findAll();
    }
}
