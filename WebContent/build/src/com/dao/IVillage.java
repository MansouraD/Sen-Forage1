package com.dao;

import java.util.List;

import com.bean.Villages;

public interface IVillage {
	public List<Villages> liste();
	public int add(Villages Villages);
}
