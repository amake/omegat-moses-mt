Moses Connector for OmegaT
==========================

This is a plugin to allow OmegaT to source machine translations from [Moses]
(http://www.statmt.org/moses/), an open-source statistical machine translation
package.

This plugin talks to `mosesserver` over XML-RPC.


Usage
=====

In order to make use of this plugin, you must have access to an instance of
`mosesserver`.

1. Download the binary ZIP and extract its contents into one of the OmegaT
   plugins folders.

2. Provide OmegaT with the URL for your `mosesserver` instance by adding the
   following argument to your OmegaT launch script:
   
   ```
   -Dmoses.server.url=http://your.moses.instance
   ```

   If you are running `mosesserver` locally, the address will probably be
   `http://localhost:8080/RPC2`.

3. In OmegaT, enable **Options > Machine Translate > Moses**. Translations will
   appear in the Machine Translation pane.


Building
========

1. From the top level of the distribution run `mvn install`.

2. From the `target` folder, copy `omegat-moses-mt-*.jar` and the `lib` folder
   to one of the OmegaT plugin folders.


License
=======

This project is distributed under the [GNU General Public License, v3]
(http://www.gnu.org/licenses/gpl-3.0.html).

This project makes use of the following components:
- DeNormalize.java (DeNormalize License)
- Apache XML-RPC (Apache License 2.0)
- Jericho HTML Parser (LGPL-2.1)


Copyright 2014 Aaron Madlon-Kay <aaron@madlon-kay.com>