# FRAGMENTS
Demo to analyze problems when loading a fragment via `Hydra`

Fixed by disabling csrf in security-config

## Hydra
 [hydra hello](http://localhost:8081/hello)

- [x] Register applications
- [x] Serving fragment between `common` and `fragments`
- [ ] When fragments are used, normal actions no longer work.

## Common
 [common hello](http://localhost:8889/hello)

- [x] Connection to Hydra
- [x] Displaying fragment `sample` from service `fragment`

## Fragments
[fragment sample](http://localhost:8888/sample)

- [x] Connection to Hydra
- [x] Serving fragment `sample` to `common`
