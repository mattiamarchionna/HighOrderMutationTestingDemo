# High Order Mutation Testing Demo
Comandi per generare il report di PIT-HOM:
```console
mvn clean
mvn compiler:compile
mvn compiler:testCompile
mvn pitest:mutationCoverage
```
Comando per generare il report di LittleDarwin:
```console
python -m littledarwin -m -b -p src/main/ --higher-order=2 -t . -c mvn,clean,test
```
