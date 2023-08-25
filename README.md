# FRAGMENTS
Demo to analyze problems when loading a fragment via `Hydra`

Fixed by disabling csrf in security-config

## Example
start `hydra`, `common` and `fragment`
### This is OK
- [common counter](http://localhost:8889/counter)
- [common fragment counter ](http://localhost:8889/fragment)
- [fragment sample](http://localhost:8888/sample)
- [hydra counter](http://localhost:8081/counter)
- [hydra reference](http://localhost:8081/reference)

### This is **NOT** OK
- [hydra hello](http://localhost:8081/hello)

## TODO
### Hydra
 [hydra hello](http://localhost:8081/hello)

- [x] Register applications
- [x] Serving fragment between `common` and `fragments`
- [x] When fragments are used, normal actions no longer work.
- [ ] Initial attribute values are not resolved in fragment.

### Common
 [common hello](http://localhost:8889/hello)

- [x] Connection to Hydra
- [x] Displaying fragment `sample` from service `fragment`
- [x] UI **IS** updated from controller when **INTERNAL** fragments are use
- [x] UI **IS NOT** updated from controller when **EXTERNAL** fragments are use (**fixed !**)
- [ ] Initial attribute values **ARE NOT** resolved in fragment.

### Fragments
[fragment sample](http://localhost:8888/sample)

- [x] Connection to Hydra
- [x] Serving fragment `sample` to `common`
- [x] Initial attribute values **ARE** resolved in fragment (reference)[http://localhost:8888/reference]
