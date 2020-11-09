package com.dao;

import java.util.List;

import com.beans.Clients;

public interface ClientLOCAL {
	public List<Clients> liste();
	public int add(Clients Clients);
}
