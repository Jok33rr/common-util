package com.smarthouse.commonutil.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class UserDevice {
    @EmbeddedId
    private UserDeviceId id;

}
