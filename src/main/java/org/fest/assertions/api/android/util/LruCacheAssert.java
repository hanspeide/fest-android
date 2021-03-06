package org.fest.assertions.api.android.util;

import android.util.LruCache;
import org.fest.assertions.api.AbstractAssert;
import org.fest.assertions.api.MapAssert;

import static org.fest.assertions.api.Assertions.assertThat;

/** Assertions for {@link LruCache} instances. */
public class LruCacheAssert extends AbstractAssert<LruCacheAssert, LruCache> {
  public LruCacheAssert(LruCache actual) {
    super(actual, LruCacheAssert.class);
  }

  public LruCacheAssert hasEntry(Object entry) {
    isNotNull();
    MapAssert a = assertThat(actual.snapshot());
    a.overridingErrorMessage("Expected to contain entry with key <%s> but did not.");
    a.containsKey(entry);
    return this;
  }

  public LruCacheAssert hasCreateCount(int count) {
    isNotNull();
    int actualCount = actual.createCount();
    assertThat(actualCount) //
        .overridingErrorMessage("Expected create count <%s> but was <%s>.", count, actualCount) //
        .isEqualTo(count);
    return this;
  }

  public LruCacheAssert hasEvictionCount(int count) {
    isNotNull();
    int actualCount = actual.evictionCount();
    assertThat(actualCount) //
        .overridingErrorMessage("Expected eviction count <%s> but was <%s>.", count, actualCount) //
        .isEqualTo(count);
    return this;
  }

  public LruCacheAssert hasHitCount(int count) {
    isNotNull();
    int actualCount = actual.hitCount();
    assertThat(actualCount) //
        .overridingErrorMessage("Expected hit count <%s> but was <%s>.", count, actualCount) //
        .isEqualTo(count);
    return this;
  }

  public LruCacheAssert hasMaxSize(int size) {
    isNotNull();
    int actualSize = actual.maxSize();
    assertThat(actualSize) //
        .overridingErrorMessage("Expected max size <%s> but was <%s>.", size, actualSize) //
        .isEqualTo(size);
    return this;
  }

  public LruCacheAssert hasMissCount(int count) {
    isNotNull();
    int actualCount = actual.missCount();
    assertThat(actualCount) //
        .overridingErrorMessage("Expected miss count <%s> but was <%s>.", count, actualCount) //
        .isEqualTo(count);
    return this;
  }

  public LruCacheAssert hasPutCount(int count) {
    isNotNull();
    int actualCount = actual.putCount();
    assertThat(actualCount) //
        .overridingErrorMessage("Expected put count <%s> but was <%s>.", count, actualCount) //
        .isEqualTo(count);
    return this;
  }

  public LruCacheAssert hasSize(int size) {
    isNotNull();
    int actualSize = actual.size();
    assertThat(actualSize) //
        .overridingErrorMessage("Expected size <%s> but was <%s>.", size, actualSize) //
        .isEqualTo(size);
    return this;
  }
}
