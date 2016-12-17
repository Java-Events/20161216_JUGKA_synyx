package org.rapidpm.event.frp.core.model;

import java.util.Objects;

/**
 * Copyright (C) 2010 RapidPM
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Created by RapidPM - Team on 10.12.16.
 */
public class Tuple<T1, T2> {
  private T1 t1;
  private T2 t2;

  public Tuple(final T1 t1, final T2 t2) {
    this.t1 = t1;
    this.t2 = t2;
  }

  public T1 getT1() {
    return t1;
  }

  public T2 getT2() {
    return t2;
  }

  @Override
  public String toString() {
    return "Tuple{" +
        "t1=" + t1 +
        ", t2=" + t2 +
        '}';
  }

  @Override
  public boolean equals(final Object o) {
    if (this == o) return true;
    if (!(o instanceof Tuple)) return false;
    final Tuple<?, ?> tuple = (Tuple<?, ?>) o;
    return Objects.equals(t1, tuple.t1) &&
        Objects.equals(t2, tuple.t2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(t1, t2);
  }
}
