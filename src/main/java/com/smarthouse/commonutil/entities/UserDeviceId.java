package com.smarthouse.commonutil.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Getter
@Setter
public class UserDeviceId implements Serializable {
    @Column(name = "customer_id", nullable = false)
    private Long userId;
    @Column(name = "device_id", nullable = false)
    private Long deviceId;
}
