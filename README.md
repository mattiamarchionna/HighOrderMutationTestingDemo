# High Order Mutation Testing Demo

## PIT-HOM
Per installare PIT-HOM clonare il seguente [repository](https://github.com/ucd-csl/pitest) ed eseguire il comando ``` mvn install ``` all'interno della directory del progetto.


Comandi per generare il report di PIT-HOM:

```console
mvn clean
mvn compiler:compile
mvn compiler:testCompile
mvn pitest:mutationCoverage
```

## LittleDarwin

Repository: [https://github.com/aliparsai/LittleDarwin](https://github.com/aliparsai/LittleDarwin)

Per installare LittleDarwin eseguire:


```console
pip3 install littledarwin 
 ```

Puoi utilizzare il tool eseguendolo come modulo:


```console
python3 -m littledarwin [options]
 ```


Comando per generare il report di LittleDarwin:


```console
python -m littledarwin -m -b -p src/main/ --higher-order=2 -t . -c mvn,clean,test
```
