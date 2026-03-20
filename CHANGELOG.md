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

## 2026.02.06

### Added

- Designed a nutritionTracker component
- Designed a WeeklyRoutine component
- Designed a workRecords component

## 2026.03.18

### Added
- Designed `WeeklyRoutineKernel` interface with core methods: `setDay`, `hasDay`, and `size`.
- Designed `WeeklyRoutine` enhanced interface with secondary methods: `getMuscleGroup`, `getNotes`, and `clearDay`.
- Created a hierarchy diagram representing the component structure within the OSU discipline.

### Updated
- Refactored Part 2 Proof-of-Concept into `WeeklyRoutineProofOfConcept.java` to avoid naming conflicts with the new interfaces.
- Integrated `components.standard.Standard` into the kernel design to follow the software sequence discipline.