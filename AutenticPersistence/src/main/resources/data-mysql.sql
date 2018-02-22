LOCK TABLES `preventa` WRITE;
/*!40000 ALTER TABLE `preventa` DISABLE KEYS */;
INSERT INTO `preventa` VALUES (1,'Elkin Salcedo','Bogotá',1),(2,'Samuel Garcia','Manizales',1),(3,'Andres Moa','Bogotá',1),(4,'Felipe Cantillo','Medellín',1);
/*!40000 ALTER TABLE `preventa` ENABLE KEYS */;
UNLOCK TABLES;

LOCK TABLES `preventaproducto` WRITE;
/*!40000 ALTER TABLE `preventaproducto` DISABLE KEYS */;
/*!40000 ALTER TABLE `preventaproducto` ENABLE KEYS */;
UNLOCK TABLES;

LOCK TABLES `producto` WRITE;
/*!40000 ALTER TABLE `producto` DISABLE KEYS */;
INSERT INTO `producto` VALUES (1,'Zapatos Nike',120000,1),(2,'Camisa Polo',55000,1),(3,'Jean Levis',150000,1),(4,'Sudadera Puma',250000,1);
/*!40000 ALTER TABLE `producto` ENABLE KEYS */;
UNLOCK TABLES;
