
# Arquisoft I3A Team Documentation

<!-- Do  not touch anything bellow this line -->

| | **Continous Integration** | **Code Coverage** | **Code Quality** | **Endpoint**
|---|:---:|:---:|:---:|:---:|
|**[agents service](https://github.com/asw-i3a/agents-service)**        |[![CircleCI](https://circleci.com/gh/asw-i3a/agents-service/tree/master.svg?style=svg)](https://circleci.com/gh/asw-i3a/agents-service/tree/master)|[![codecov](https://codecov.io/gh/asw-i3a/agents-service/branch/master/graph/badge.svg)](https://codecov.io/gh/asw-i3a/agents-service)|[![Codacy Badge](https://api.codacy.com/project/badge/Grade/e1e90c5a89fd4da6908296545e952c81)](https://www.codacy.com/app/colunga91/agents-service?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=asw-i3a/agents-service&amp;utm_campaign=Badge_Grade)|[![Docker Badge](https://img.shields.io/badge/docker%20image-latest-blue.svg)](https://hub.docker.com/r/incisystem/agents_service/)
|**[operators service](https://github.com/asw-i3a/operators-service)** |[![CircleCI](https://circleci.com/gh/asw-i3a/operators-service/tree/master.svg?style=svg)](https://circleci.com/gh/asw-i3a/operators-service/tree/master)|[![codecov](https://codecov.io/gh/asw-i3a/operators-service/branch/master/graph/badge.svg)](https://codecov.io/gh/asw-i3a/operators-service)|[![Codacy Badge](https://api.codacy.com/project/badge/Grade/76aa0b37d6d04efbb066b869e474e273)](https://www.codacy.com/app/colunga91/operators-service?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=asw-i3a/operators-service&amp;utm_campaign=Badge_Grade)|[![Docker Badge](https://img.shields.io/badge/docker%20image-latest-blue.svg)](https://hub.docker.com/r/incisystem/operators_service/)
|**[incidents service](https://github.com/asw-i3a/incidents-service)** |[![CircleCI](https://circleci.com/gh/asw-i3a/incidents-service.svg?style=svg)](https://circleci.com/gh/asw-i3a/incidents-service)|[![codecov](https://codecov.io/gh/asw-i3a/incidents-service/branch/master/graph/badge.svg)](https://codecov.io/gh/asw-i3a/incidents-service)|[![Codacy Badge](https://api.codacy.com/project/badge/Grade/a43047eb0e3942a3af3ef93901cdfa87)](https://www.codacy.com/app/colunga91/incidents-service?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=asw-i3a/incidents-service&amp;utm_campaign=Badge_Grade)|[![Docker Badge](https://img.shields.io/badge/docker%20image-latest-blue.svg)](https://hub.docker.com/r/incisystem/incidents_service/)
|**[sensor data mining service](https://github.com/asw-i3a/sensor-data-mining)** |[![Build Status](https://travis-ci.com/asw-i3a/sensor-data-mining.svg?branch=master)](https://travis-ci.com/asw-i3a/sensor-data-mining)|||-
|**[agents desktop client](https://github.com/asw-i3a/agents-desktop-client)** |[![Build Status](https://travis-ci.org/Arquisoft/Loader_i3a.svg?branch=master)](https://travis-ci.org/Arquisoft/Loader_i3a)|[![codecov](https://codecov.io/gh/Arquisoft/Loader_i3a/branch/master/graph/badge.svg)](https://codecov.io/gh/Arquisoft/Loader_i3a)|[![Codacy Badge](https://api.codacy.com/project/badge/Grade/27b04e16c41248d0abad6d5a4ce83911)](https://www.codacy.com/app/jelabra/Loader_i3a?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=Arquisoft/Loader_i3a&amp;utm_campaign=Badge_Grade)|-
|**[agents web client](https://github.com/asw-i3a/agents-web-client)** |[![CircleCI](https://circleci.com/gh/asw-i3a/agents-web-client.svg?style=svg)](https://circleci.com/gh/asw-i3a/agents-web-client)|[![codecov](https://codecov.io/gh/asw-i3a/agents-web-client/branch/master/graph/badge.svg)](https://codecov.io/gh/asw-i3a/agents-web-client)|[![Codacy Badge](https://api.codacy.com/project/badge/Grade/93c9cdf439f7444481c42c426c0e988f)](https://www.codacy.com/app/colunga91/agents-web-client?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=asw-i3a/agents-web-client&amp;utm_campaign=Badge_Grade)|[AWS](http://asw-i3a-agents-client.guill.io)
|**[operators web client](https://github.com/asw-i3a/operators-web-client)** |[![Build Status](https://travis-ci.org/Arquisoft/InciDashboard_i3a.svg?branch=master)](https://travis-ci.org/Arquisoft/InciDashboard_i3a)|[![codecov](https://codecov.io/gh/Arquisoft/InciDashboard_i3a/branch/master/graph/badge.svg)](https://codecov.io/gh/Arquisoft/InciDashboard_i3a)|[![Codacy Badge](https://api.codacy.com/project/badge/Grade/27b04e16c41248d0abad6d5a4ce83911)](https://www.codacy.com/app/jelabra/InciDashboard_i3a?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=Arquisoft/Loader_i3a&amp;utm_campaign=Badge_Grade)|[AWS](http://asw-i3a-operators-client.guill.io)

<!-- Do  not touch anything above this line -->

## Most important technologies used
### Eureka
[Eureka](https://github.com/Netflix/eureka) is a REST (Representational State Transfer) based service that is primarily used in the AWS cloud for locating services for the purpose of load balancing and failover of middle-tier servers.

**How we use it:**

We use eureka as our main mocro-services orchestration system.

### Zuul
[Zuul](https://github.com/Netflix/zuul) is an edge service that provides dynamic routing, monitoring, resiliency, security, and more. Please view the wiki for usage, information, HOWTO, etc https://github.com/Netflix/zuul/wiki

**How we use it:**

We use zuul for the edge API gateway. Through it the clients can access to the private cloud.

### Hystrix
[Hystrix](https://github.com/Netflix/Hystrix) is a latency and fault tolerance library designed to isolate points of access to remote systems, services and 3rd party libraries, stop cascading failure and enable resilience in complex distributed systems where failure is inevitable.

**How we use it:**

We build our microservice to support failures. That is, in case of a failure the corresponding microservice will offer an alternative resiliant alternative.
