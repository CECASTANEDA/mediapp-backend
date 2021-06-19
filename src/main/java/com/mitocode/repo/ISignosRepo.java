package com.mitocode.repo;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mitocode.model.Consulta;
import com.mitocode.model.Signos;

//@Repository
public interface ISignosRepo extends IGenericRepo<Signos, Integer> {

}
