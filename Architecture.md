# ARCHITECTURE

## What is this?
This document describes high-level architecture of DI-Container Framework.

**Goals and Limitations**
  - **Basic functional requirements**
    - Option to create DI-container object
    - Add class to container
    - Delete class from container;
    - Option to check class information;
    - Inject dependency into class;
    - Annotation support;
        1) Option to add  class using annotations;
        2) Add dependency into class usting annotations;
  - **Architectural goals**
    - Java API support for interacting with the DI container
    - Support for external metadata of container-managed classes (JSON/XML/YAML) containing
        1) class;
        2) name;
        3) object lifecycle type;
        4) initialization parameters;
        5) constructor parameters;




