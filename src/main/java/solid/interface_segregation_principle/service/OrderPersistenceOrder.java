package solid.interface_segregation_principle.service;

import java.util.HashMap;
import java.util.Map;

import solid.interface_segregation_principle.entity.Order;

public class OrderPersistenceOrder implements PersistenceService<Order>{

	private static final Map<Long, Order> ORDERS = new HashMap<>();
	
	@Override
	public void save(Order entity) {
		synchronized (ORDERS) {
			ORDERS.put(entity.getId(), entity);
		}
	}

	@Override
	public void delete(Order entity) {
		synchronized (ORDERS) {
			ORDERS.remove(entity.getId());
		}
	}

	@Override
	public Order findById(Long id) {
		synchronized (ORDERS) {
			return ORDERS.get(id);
		}
	}

}
