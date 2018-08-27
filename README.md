# Spring-cloud-eureka-serviceDiscovery

Mise en place d'un serviceDiscovery dans le cas d'une architecture microservice. Le serviceDiscovery est un service possédant un registry sur lequel vont s'enregistrer tous les services du système. Dans le cas de figure présant, la technologie utilisé correspond à du [NETFLIX OSS Eureka](https://github.com/Netflix/eureka) (Spring cloud) 

## Configuration

Pour le bien du POC, ce projet contient une configuration spécifique ou le serviceDiscovery ne cherche pas à s'enregistrer auprès d'un autre serviceDiscovery (déconseillé en production).

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management
