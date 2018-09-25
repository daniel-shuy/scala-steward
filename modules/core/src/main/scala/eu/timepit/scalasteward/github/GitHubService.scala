/*
 * Copyright 2018 scala-steward contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package eu.timepit.scalasteward.github

trait GitHubService[F[_]] {

  /** https://developer.github.com/v3/repos/forks/#create-a-fork */
  def createFork(user: AuthenticatedUser, repo: Repo): F[RepoOut]

  /** https://developer.github.com/v3/pulls/#create-a-pull-request */
  def createPullRequest(
      user: AuthenticatedUser,
      repo: Repo,
      data: CreatePullRequestIn
  ): F[PullRequestOut]
}
