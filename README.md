# ViewPager2PageTransformers
---

A set of `PageTransformer`'s which can be set to a `ViewPager2`.
<br>The set includes the following PageTransformers:
```
BackgroundToForegroundTransformer
CubeInTransformer
CubeOutTransformer
DepthTransformer
FlipHorizontalTransformer
FlipVerticalTransformer
ForegroundToBackgroundTransformer
RotateDownTransformer
RotateUpTransformer
TabletTransformer
ZoomInTransformer
ZoomOutTransformer
```
### Usage
---
1. Edit your *build.gradle* to include the library and sync.
```
dependencies {
    implementation 'danny.view-pager-2-page-transformers:horizontal-transformers:1.0.0'
}
```
2. Add to your `ViewPager2` a `PageTransformer` from the list above.
```
viewPager2.setOrientation(ViewPager2.ORIENTATION_HORIZONTAL);
viewPager2.setPageTransformer(new DepthTransformer());
```
3. your turn.

### Notes
This library currently supports only `viewPager2` with horizontal orientation 

AUTHOR
-------
**Danny Hadar**

LICENSE
--------
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
