# anylock-zk
lock utils for zk

##demo:
```java
ZKLock lock = null;
try {
	lock = new ZKLock("127.0.0.1:2182", "test");
	lock.lock();
	// do something...
} catch (Exception e) {
	//TODO
} finally {
	if (lock != null)
	lock.unlock();
}
```

##maven:
```xml
<dependency>
    <groupId>com.importsource.anylock</groupId>
    <artifactId>anylock-zookeeper</artifactId>
    <version>0.0.1-SNAPSHOT</version>
</dependency>
```
