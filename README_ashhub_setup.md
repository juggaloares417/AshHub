# AshHub Scaffold (drop-in)

This bundle adds a minimal Android app module `ashhub/` and a CI workflow that builds a debug APK.

## Steps (no terminal required)
1. In GitHub Web UI for your repo (e.g., `juggaloares417/ashshell`), upload all files in this zip to the **repo root**, preserving folders.
2. **Edit one file** in Web UI: open `settings.gradle` or `settings.gradle.kts` and add the include line:
   - Groovy: `include(":ashhub")`
   - Kotlin DSL: add `include(":ashhub")` near the top.
3. Commit. GitHub Actions will run and publish artifact **ashhub-debug**.
4. Download the artifact from the Actions run page, or have your on-device watchers fetch it.

## Notes
- If your project already uses Kotlin DSL (`settings.gradle.kts`), no other changes needed.
- If you have a multi-module layout, just ensure `ashhub` is included and Gradle syncs.
- The workflow provided only builds `ashhub`. You can add other modules later.

