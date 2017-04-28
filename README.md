Audit4j integration with CDI
========================
Author: Edward P. Legaspi
Level: Intermediate
Technologies: CDI, Audit4j, Postgresql
Summary: audit4j integration with cdi using interceptor.
Target Project: WildFly

What is it?
-----------
A JavaEE project (created using JavaEE war archetype) that shows how audit4j is integrated in a CDI project. Log is stored in a postgresql table.

Table name is: audit4j, same for db username and password. It will automatically create the audit table.