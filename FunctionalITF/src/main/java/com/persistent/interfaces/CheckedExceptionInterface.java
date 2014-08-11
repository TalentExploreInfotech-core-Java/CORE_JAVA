package com.persistent.interfaces;
@FunctionalInterface
public interface CheckedExceptionInterface<T extends Number> {
	void func(T[] arr) throws ArrayEmptyException;
}
