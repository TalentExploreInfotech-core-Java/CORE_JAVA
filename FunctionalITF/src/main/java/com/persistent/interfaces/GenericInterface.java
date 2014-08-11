package com.persistent.interfaces;

import java.util.List;

public interface GenericInterface<T> {
  T func(List<T> list);
}
