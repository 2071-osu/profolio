# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.1.0/),
and this project adheres to [Calendar Versioning](https://calver.org/) of
the following form: YYYY.0M.0D.

## 2026.02.26

### Added

- Designed a proof of concept (MVP) for the WeeklyRoutine component
- Implemented core representation and kernel methods (`setDay`, `getMuscleGroup`, `getNotes`, `clearDay`) for WeeklyRoutine
- Added a main method to demonstrate the client view and prove the concept's feasibility
### Updated
- Justified the design choice in the Part 2 Markdown document by considering personal interests and implementation feasibility.

## 2026.02.06

### Added

- Designed a nutritionTracker component
- Designed a WeeklyRoutine component
- Designed a workRecords component

## 2026.04.05

### Added
- Created `WeeklyRoutineSecondary.java` abstract class for the Weekly Routine component.
- Implemented common `Object` methods (`toString()` and `equals()`) in the abstract class using only kernel methods to adhere to the component discipline.
- Implemented the secondary method `clear()` using the kernel methods `hasDay()` and `removeDay()`, ensuring proper design-by-contract (checking preconditions before removal).
- Re-added the `WeeklyRoutine.java` enhanced interface to the `abstract-class` branch to resolve compilation errors caused by Git branch isolation (previous interface design is still in an open PR).

## 2026.04.15

### Added
- Created `WeeklyRoutine1L` kernel implementation using `java.util.Map`.
- Implemented `Standard` methods: `clear`, `newInstance`, and `transferFrom`.
- Defined Convention and Correspondence for the `Map`-based representation.

### Updated
- Finalized the internal data structure to handle workout notes and muscle groups efficiently.
