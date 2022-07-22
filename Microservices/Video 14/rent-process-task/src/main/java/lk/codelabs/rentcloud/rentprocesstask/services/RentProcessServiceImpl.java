package lk.codelabs.rentcloud.rentprocesstask.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RentProcessServiceImpl implements RentProcessService {

    @Autowired
    RentProcessService rentProcessService;

    public boolean validateDL(String dlNumber){
        return dlNumber.length()>0;
    }
}
