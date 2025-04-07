package net.minecraft.forthou.util;
import net.minecraftforge.eventbus.api.IEventBus;
import java.util.function.Consumer;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBusInvokeDispatcher;
import net.minecraftforge.eventbus.api.GenericEvent;

/**
 * @Author ZerWhit
 * @Date 2025/04/07 22:03
 */
public class ForthouBus implements IEventBus {

	@Override
	public <T extends GenericEvent<? extends F>, F extends Object> void addGenericListener(Class<F> mClass, Consumer<T> consumer) {
	}

	@Override
	public <T extends GenericEvent<? extends F>, F extends Object> void addGenericListener(Class<F> mClass, EventPriority eventPriority, Consumer<T> consumer) {
	}

	@Override
	public <T extends GenericEvent<? extends F>, F extends Object> void addGenericListener(Class<F> mClass, EventPriority eventPriority, boolean p, Class<T> mClass1, Consumer<T> consumer) {
	}

	@Override
	public <T extends GenericEvent<? extends F>, F extends Object> void addGenericListener(Class<F> mClass, EventPriority eventPriority, boolean p, Consumer<T> consumer) {
	}

	@Override
	public <T extends Event> void addListener(Consumer<T> consumer) {
	}

	@Override
	public <T extends Event> void addListener(EventPriority eventPriority, Consumer<T> consumer) {
	}

	@Override
	public <T extends Event> void addListener(EventPriority eventPriority, boolean p, Class<T> mClass, Consumer<T> consumer) {
	}

	@Override
	public <T extends Event> void addListener(EventPriority eventPriority, boolean p, Consumer<T> consumer) {
	}

	@Override
	public boolean post(Event event) {
		return false;
	}

	@Override
	public boolean post(Event event, IEventBusInvokeDispatcher iEventBusInvokeDispatcher) {
		return false;
	}

	@Override
	public void register(Object object) {
	}

	@Override
	public void shutdown() {
	}

	@Override
	public void start() {
	}

	@Override
	public void unregister(Object object) {
	}
}
