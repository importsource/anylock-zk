# anylock-zk
lock utils for zk

```java
DistributedLock lock = null;
		try {
			lock = new DistributedLock("127.0.0.1:2182", "test");
			lock.lock();
			// do something...
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (lock != null)
			lock.unlock();
		}
```
