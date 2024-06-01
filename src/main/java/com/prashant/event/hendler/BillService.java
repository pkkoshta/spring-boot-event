package com.prashant.event.hendler;

import com.prashant.event.event.DischargeEventPublisher;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class BillService {

    @Async
    @EventListener
    public void checkBillPayment(DischargeEventPublisher publisher){
        System.out.println("Bill checking -->" + "no bill pending for "+ publisher.getName());
    }
}
