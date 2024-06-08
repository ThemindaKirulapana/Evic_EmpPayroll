package com.dinemore.cud.service;

import com.dinemore.cud.dto.Leavedato;
import com.dinemore.cud.dto.ResponseDTO;

public interface LeaveService {

    public ResponseDTO saveLeaveEmp(Leavedato leavedato);
}
