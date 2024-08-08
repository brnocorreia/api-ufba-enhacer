-- name: GetAllCourses :many
SELECT
    "course_id",
    "code",
    "name",
    "workload",
    "department",
    "program",
    "objective",
    "content",
    "bibliography",
    "created_at",
    "updated_at"
FROM
    "courses"
ORDER BY
    "name" ASC;

-- name: GetCourseByCode :one
SELECT
    "course_id",
    "code",
    "name",
    "workload",
    "department",
    "program",
    "objective",
    "content",
    "bibliography",
    "created_at",
    "updated_at"
FROM
    "courses"
WHERE
    "code" = $1;

-- name: GetCourseByName :many
SELECT
    "course_id",
    "code",
    "name",
    "workload",
    "department",
    "program",
    "objective",
    "content",
    "bibliography",
    "created_at",
    "updated_at"
FROM
    "courses"
WHERE
    "name" = $1
ORDER BY
    "name" ASC;

-- name: GetCoursesByDepartment :many
SELECT
    "course_id",
    "code",
    "name",
    "workload",
    "department",
    "program",
    "objective",
    "content",
    "bibliography",
    "created_at",
    "updated_at"
FROM
    "courses"
WHERE
    "department" = $1
ORDER BY
    "name" ASC;

-- name: GetCoursesByWorkload :many
SELECT
    "course_id",
    "code",
    "name",
    "workload",
    "department",
    "program",
    "objective",
    "content",
    "bibliography",
    "created_at",
    "updated_at"
FROM
    "courses"
WHERE
    "workload" = $1;

-- name: InsertCourse :exec
INSERT INTO
    "courses" (
        "code",
        "name",
        "workload",
        "department",
        "program",
        "objective",
        "content",
        "bibliography"
    )
VALUES (
        $1,
        $2,
        $3,
        $4,
        $5,
        $6,
        $7,
        $8
    )
RETURNING "course_id";