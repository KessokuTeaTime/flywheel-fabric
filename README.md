<div align="center">
<img src="https://i.imgur.com/yVFgPpr.png" alt="Logo by @voxel_dani on Twitter" width="250">
<h1>Flywheel Fabric DM-Earth Edition</h1>
<h6>A modern engine for modded Minecraft.</h6>
<br>
</div>

### About

The goal of this project is to provide tools for mod developers so they no longer have to worry about performance, or
limitations of Minecraft's archaic rendering engine. That said, this is primarily an outlet for me to have fun with
graphics programming.

### Instancing

Flywheel provides an alternate, unified path for entity and tile entity rendering that takes advantage of GPU
instancing. In doing so, Flywheel gives the developer the flexibility to define their own vertex and instance formats,
and write custom shaders to ingest that data.

### Shaders

To accomodate the developer and leave more in the hands of the engine, Flywheel provides a custom shader loading and
templating system to hide the details of the CPU/GPU interface. This system is a work in progress. There will be
breaking changes, and I make no guarantees of backwards compatibility.

### Plans

- Vanilla performance improvements
- Compute shader particles
- Deferred rendering
- Different renderers for differently aged hardware

### Getting Started (For Developers)

Add the following repo and dependency to your `build.gradle`:

```groovy
repositories {
    maven {
        name "jitpack maven"
        url "https://www.jitpack.io/"
    }
}

dependencies {
    modImplementation "com.github.DM-Earth:flywheel-fabric-dme-edition:${flywheel_version}"
}
```
`${flywheel_version}` gets replaced by the version of Flywheel you want to use, eg. `1.18-0.3.0.3`

For a list of available Flywheel versions, you can check the releases.
