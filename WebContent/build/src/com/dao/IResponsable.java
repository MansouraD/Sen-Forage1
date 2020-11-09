package com.dao;

import java.util.List;

import com.bean.Responsables;


public interface IResponsable {
	public List<Responsables> liste();
	public int add(Responsables Responsables);

}
