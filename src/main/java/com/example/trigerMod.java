from pathlib import Path
import zipfile
from textwrap import dedent

base = Path("/mnt/data/rigged-dropper-toggle")
(base / "src/main/java/com/example/riggeddropper").mkdir(parents=True, exist_ok=True)
