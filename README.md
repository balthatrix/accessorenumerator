# accessorenumerator
Enumerates java methods via a REST service. 

Only lists methods which return non-VOID type and have 0 parameters.

The Spigot API is already included in the pom.xml. To use another dependency simply add it to the pom.xml and re-package.

Use:

```
:4567/getters/org.bukkit.event.entity.CreatureSpawnEvent
```

Returns:
```
getEntity
getEntity
getCreatureType
getSpawnReason
getLocation
getHandlerList
getHandlers
isCancelled
getEntityType
getEventName
isAsynchronous
toString
hashCode
getClass
```
