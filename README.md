# High Order Mutation Testing Demo

[![pipeline status](https://gitlab.com/mattiamarchionna/highordermutationtestingdemo/badges/master/pipeline.svg)](https://gitlab.com/mattiamarchionna/highordermutationtestingdemo/-/commits/master)

Introduzione su analisi mutazionale di ordine superiore utilizzando due tool _Java_: _PIT-HOM_ e _LittleDarwin_.

## PIT-HOM
Per installare PIT-HOM clonare il seguente [repository](https://github.com/ucd-csl/pitest) ed eseguire il comando ``` mvn install ``` all'interno della directory del progetto per installare localmente il tool. 

Successivamente sarà possibile specificare il plugin all'interno del file _pom.xml_:

```xml
<plugin>
    <groupId>org.pitest</groupId>
    <artifactId>pitest-maven</artifactId>
    <version>1.5.1-HOM</version>
    <dependencies>
        <dependency>
            <groupId>org.pitest</groupId>
            <artifactId>pitest-junit5-plugin</artifactId>
            <version>0.12</version>
        </dependency>
    </dependencies>
    <configuration>
        <targetClasses>
            <param>it.unimi.di.vec.*</param>
        </targetClasses>
        <targetTests>
            <param>it.unimi.di.vec.*</param>
        </targetTests>
        <hom>2</hom>
        <mutators>STRONGER</mutators>
        <mutantProcessingMethod>stream-batch</mutantProcessingMethod>
    </configuration>
</plugin>
```



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
